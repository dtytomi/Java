class TwitterSolution {
    
    public static  String addLikes(String like1, String like2) {
        
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int p1 = like1.length() - 1;
        int p2 = like2.length() - 1;

       while (p1 >= 0 || p2 >= 0) {
            
            int x1, x2;

            if (p1 >= 0) 
                x1 = like1.charAt(p1) - '0';
            else 
               x1 = 0;
            
            if (p2 >= 0)
               x2 = like2.charAt(p2) - '0';
            else
                x2 = 0;

            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry ) / 10;

            res.append(value);
            p1--;
            p2--;

        } 
        
       if (carry != 0)
           res.append(carry);

       return res.reverse().toString();

    }

    public static void main(String [] args) {
        System.out.println(addLikes("1545", "67"));
    }

}
