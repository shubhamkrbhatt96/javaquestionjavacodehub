import java.util.*;
class MapInterfaceExample{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(100,"Rajendra");
map.put(101,"Lamror");
map.put(102,"Technolamror");
for(Map.Entry m:map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}