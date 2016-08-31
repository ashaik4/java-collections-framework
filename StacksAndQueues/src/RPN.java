/**
 * Created by Administrator on 8/29/2016.
 */
public class RPN {
    public static void main(String[] args) {
    // converting infix to postfix
        String inputString = new String("3+5*2-8/4");
        //output string = 352*+84/-
        String outputString = "";
        CS401StackArrayImpl<Character> operator_stack = new CS401StackArrayImpl<>();
        for (int i = 0; i < inputString.length(); i++) {
         Character operand=inputString.charAt(i);
           if (operand=='-'){
                   while(operator_stack.size()>0){
                           outputString += operator_stack.pop().charValue();
                   }
                   operator_stack.push(operand);
               }
           else if(operand == '+'){
               if (operator_stack.size()==0){
                   operator_stack.push(operand);
               }
               else{
                   while(operator_stack.size()>0){
                       Character peekChar = operator_stack.peek();
                       if(peekChar=='*'||peekChar=='/'){
                           outputString+=operator_stack.pop().charValue();
                       }else{
                           operator_stack.push(operand);
                           break;
                       }
                   }

               }
           }
           else if(operand =='*'){
               if (operator_stack.size()==0){
                   operator_stack.push(operand);
               }
               else{
                   while(operator_stack.size()>0){
                       Character peekChar = operator_stack.peek();
                       if(peekChar=='/'||peekChar=='*'){
                           outputString+=operator_stack.pop().charValue();
                       }else{
                           operator_stack.push(operand);
                           break;
                       }
                   }
               }
           }
           else if(operand == '/'){
               if (operator_stack.size()==0){
                   operator_stack.push(operand);
               }else{
                   while(operator_stack.size()>0){
                       Character peekChar = operator_stack.peek();
                       if (peekChar == '/'){
                           outputString+=operator_stack.pop().charValue();
                       }else{
                           operator_stack.push(operand);
                           break;
                       }
                   }
               }
           }
           else{
               outputString += inputString.charAt(i);

           }

        }
        while(operator_stack.size()>0) {
         outputString += operator_stack.pop().charValue();
        }
        System.out.println(outputString);

    }
}

