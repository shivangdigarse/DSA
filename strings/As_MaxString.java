package strings;

public class As_MaxString {
    public static String max(String maxS, String ele){
        String a = purify(maxS);
        String b = purify(ele);
        if(a.length() > b.length()) return maxS;
        else if(a.length() < b.length()) return ele;
        else{
            int x = 0;
            while(a.length() > x){
                if(a.charAt(x)>b.charAt(x)) return maxS;
                else if(a.charAt(x)<b.charAt(x)) return ele;
                else x++;
            }
        }
        return maxS;
    }
    public static String purify(String str){
        if(str == null) return null;
        while(str.charAt(0) == '0'){
            str = str.replaceFirst("0","");
        }
        return str;
    }
    public static void main(String[] args) {
        String[] arr = {"234","0074","1000","3214","20","0000000001"};
        String maxS = arr[0];
        for(String ele: arr){
            maxS = max(maxS,ele);
        }
        System.out.println(maxS);
    }
}
