package test;
import java.util.*;

public class Infix2Postfix {
    public static String convert(String exp) {
        if (exp == null || exp.length() == 0) return null;
        
        // 핵심: 맨 앞이거나 연산자/여는 괄호 뒤에 오는 '-'를 음수 기호 '~'로 치환하여 빼기와 구분합니다.
        exp = exp.replaceAll("(^|[+\\-*/(])\\s*-", "$1 ~");

        // '~' 기호도 구분자에 추가
        StringTokenizer st = new StringTokenizer(exp, "+-*/()~", true);
        Stack<String> stack = new Stack<String>();
        StringBuffer buf = new StringBuffer();

        while (st.hasMoreTokens()) {
            String tok = st.nextToken().trim();
            if (tok.isEmpty()) continue; // 공백 토큰 무시

            if (isOperator(tok)) {
                if (tok.equals("(")) {
                    stack.push(tok);
                } else if (tok.equals(")")) {
                    while (!stack.empty() && !stack.peek().equals("(")) {
                        buf.append(stack.pop()).append(" ");
                    }
                    if (!stack.empty() && stack.peek().equals("(")) {
                        stack.pop(); // '(' 제거
                    }
                } else {
                    // 연산자 우선순위에 따라 pop
                    while (!stack.empty() && precedence(stack.peek()) >= precedence(tok)) {
                        buf.append(stack.pop()).append(" ");
                    }
                    stack.push(tok);
                }
            } else {
                // 숫자일 경우 바로 버퍼에 추가
                buf.append(tok).append(" ");
            }
        }

        // 스택에 남은 모든 연산자 pop
        while (!stack.empty()) {
            buf.append(stack.pop()).append(" ");
        }

        return buf.toString().trim();
    }

    // 연산자 여부 확인
    public static boolean isOperator(String op) {
        return "+-*/()~".contains(op) && op.length() == 1;
    }

    // 우선순위 반환
    public static int precedence(String op) {
        switch (op) {
            case "(": case ")": return 0;
            case "+": case "-": return 1;
            case "*": case "/": return 2;
            case "~": return 3; // 단항 음수 기호가 가장 우선순위가 높음
            default: return -1;
        }
    }

    public static void main(String[] args) {
        // 음수와 괄호가 포함된 테스트 식
        String exp = "-12 + 2.5 * (-5 + 3)";
        System.out.printf("%s \n==> %s \n", exp, Infix2Postfix.convert(exp));
    }
}