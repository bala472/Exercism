
class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException,ArithmeticException,IllegalOperationException{
        if(operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty())
            throw new IllegalArgumentException("Operation cannot be empty");
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        if(operation.equals("+"))
            return Integer.toString(operand1)+" "+operation+" "+Integer.toString(operand2)+" "+"= "+Integer.toString(operand1+operand2);
        if(operation.equals("-"))
            return Integer.toString(operand1)+" "+operation+" "+Integer.toString(operand2)+" "+"= "+Integer.toString(operand1-operand2);
        if(operation.equals("*"))
            return Integer.toString(operand1)+" "+operation+" "+Integer.toString(operand2)+" "+"= "+Integer.toString(operand1*operand2);
        if(operation.equals("/")){
            if(operand2==0){
                throw new IllegalOperationException ("Division by zero is not allowed",new ArithmeticException());
            }
            return Integer.toString(operand1)+" "+operation+" "+Integer.toString(operand2)+" "+"= "+Integer.toString(operand1/operand2);
        }
        return "";
    }

}
