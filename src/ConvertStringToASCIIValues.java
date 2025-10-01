import java.util.List;

public class ConvertStringToASCIIValues {
    public static void main(String[] args) {
        String str="abc" ;
        List<Integer> result = str.chars()
                .mapToObj(s -> (Integer)s)
                .toList();
        System.out.println(result);


        Object[] ob=new Object[]{2,5,3,1,'r','t',false,true,"String"};

        System.out.println(ob);;
    }
}
