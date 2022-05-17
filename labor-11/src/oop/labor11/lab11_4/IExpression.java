package oop.labor11.lab11_4;

import java.util.EmptyStackException;
//import java.util.Stack;

public interface IExpression {

    static boolean isOperator(String item) {
        item = item.trim();
        return item.equals("+") || item.equals("*") || item.equals("-") || item.equals("/");
    }

    static double evaluate(String postfixExpression) throws ExpressionException {
        Stack stack = new Stack(10);
       // Stack<Double> stack = new Stack<>();
        String [] items = postfixExpression.split(" ");
        for( String item: items ){
            item = item.trim();
            // operator
            if( isOperator(item)){
                // kivesszuk a verem ket felso elemet es elvegezzuk a muveletet
                // ha nincsen legalabb 2 elem a veremben --> kivetelt dobunk
                try{
                    double operand1 = (double) stack.pop();
                    double operand2 = (double) stack.pop();
                    switch( item ){
                        case "+": stack.push(operand1 + operand2); break;
                        case "-": stack.push(operand1 - operand2); break;
                        case "*": stack.push(operand1 * operand2); break;
                        case "/": stack.push(operand2 / operand1); break;
                    }
                }catch( EmptyStackException e ){
                    throw new ExpressionException("Wrong postfix expression");
                }
            }
            // operandus
            else{
                try{
                    stack.push( Double.parseDouble(item));
                }catch(NumberFormatException e ){
                    throw new ExpressionException("Wrong operand: " + item);
                }
            }
        }
        try{
            return (double) stack.pop();
        }catch( EmptyStackException e ){
            throw new ExpressionException("Wrong postfix expression");
        }
    }
}

