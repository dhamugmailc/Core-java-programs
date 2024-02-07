package collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
        st.push("ss");
        st.push("dhamu");
        st.push("arun");
        System.out.println(st);
        //st.peek();
       // System.out.println(st);
        st.pop();
        System.out.println(st);
	}

}
