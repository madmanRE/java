package seminar4;

import java.util.Stack;

class Main2 {

    public static void main(String[] args){
        System.out.println(isValid("({)"));
        System.out.println(isValid("({})"));
        System.out.println(isValid("({)}"));
        System.out.println(isValid("("));
        System.out.println(isValid("[]"));
        System.out.println(isValid("[{()}]"));
        System.out.println(isValid("{()}]"));
        System.out.println(isValid("[{(}]"));
        System.out.println(isValid("[{(([{{{}}}]))}]"));
    }

    // Метод push() помещает объект в стек
    // Object peek() Возвращает элемент, находящийся в верхней части стэка, но не удаляет его.
    public static boolean isValid(String s) {
        // Проверяем на четность, если нет - значит точно фалс
        if(s.length()%2!=0)
            return false;
        // Объявляем стек
        Stack<Character> stack = new Stack<>();

        //Перебираем строку посимвольно
        for(char ch:s.toCharArray())
        {
            // Открывающие скобки загоняем в стек
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }
            // Закрывающие сравниваем с последним элементом стека, если сопоставляются - все ок, т.к. первый вошел - последний вышел
            else if(ch==']' && !stack.isEmpty() && stack.peek()=='[') // 1[ 2( 3) 4] --Вошли в стек--> 2(1[    |   )] не вошли ---Выходят--->  1(2[ --> ( сравнивается с ), [ с ]!
                stack.pop();
            else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{')
                stack.pop();
            else if(ch==')' && !stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}