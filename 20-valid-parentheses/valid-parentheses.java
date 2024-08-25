class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char ele=st.pop();
                    if((ele=='(' && ch==')') || (ele=='{' && ch=='}') || (ele=='[' && ch==']')){
                        continue;
                    }
                    else{
                        return false;
                    }
                } 
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}