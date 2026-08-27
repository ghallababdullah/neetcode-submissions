class Solution {
    public boolean isPalindrome(String s) {
      /*  StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        return str.toString().equals(str.reverse().toString());*/


        // на нужно здсь использщовать паттерн двух указателя
        // то есть с каждого конца мы будем проверять char  и сравниваем с дру с другом при отличие сразу false
        int left =0; int right = s.length()-1 ; 
        while(left<right){

            while(left<right && !isValid(s.charAt(left))){
                left++;
            }
             while(left<right && !isValid(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) )
            {return false;}


  left++; right--;

        }return true; 
        
       


    }

    // нужно написать метод клоторый будет проверять символ ли данный char ( число или буква)
    private boolean isValid(char c){
               return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
