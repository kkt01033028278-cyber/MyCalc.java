package test;
import java.util.*;

public class Calc {
    public static double eval(String exp) {
        StringTokenizer st = new StringTokenizer(exp);
        Stack<Double> stack = new Stack<Double>();

        while (st.hasMoreTokens()) {
            String tok = st.nextToken();
            
            if (Infix2Postfix.isOperator(tok)) {
                if (tok.equals("~")) {
                    // 단항 연산자(음수)인 경우: 하나만 꺼내서 부호를 바꿔 다시 넣음
                    double v = stack.pop();
                    stack.push(-v);
                } else {
                    // 이항 연산자인 경우: 두 개를 꺼내서 계산
                    double v1 = stack.pop(); // 뒤에 들어간 숫자가 우항
                    double v2 = stack.pop(); // 먼저 들어간 숫자가 좌항
                    double value = 0;
                    
                    switch (tok) {
                        case "+": value = v2 + v1; break;
                        case "-": value = v2 - v1; break;
                        case "*": value = v2 * v1; break;
                        case "/": value = v2 / v1; break;
                    }
                    stack.push(value);
                }
            } else {
                // 숫자인 경우 스택에 추가
                stack.push(Double.parseDouble(tok));
            }
        }
        
        return stack.pop(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수식을 입력하세요 (예: -12 + 2.5 * (-5 + 3)): ");
        String infix = sc.nextLine();
        
        String postfix = Infix2Postfix.convert(infix);
        double value = Calc.eval(postfix);
        
        System.out.println("후위 표기법: " + postfix);
        System.out.printf("계산 결과: %s = %.2f\n", infix, value);
        
        sc.close();
    }
}