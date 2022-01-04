class Solution4 {
    public boolean isValid(String s) {
        boolean flag=false;
			Stack<Character> st=new Stack<Character>();
	        HashMap<Character,Character> mapToken=new HashMap<Character,Character>();
	        mapToken.put(']', '[');
	        mapToken.put(')', '(');
	        mapToken.put('}', '{');
			char[] arr=s.toCharArray();
			for(char x:arr) {
				if( (x=='(') || (x=='{') || (x=='[')) {
					st.push(x);
					
				}
	            else if ((st.size()==0) && ((x==']') || (x=='}') || (x==')'))){
	                return false;
	            }
	            else if ((st.size()>0) && mapToken.get(x)!=st.pop()) {
	            	return false;
	            }
			}

			if(st.size()==0) {
				flag=true;
			
			}
			
			return flag;
	
    

    }
}