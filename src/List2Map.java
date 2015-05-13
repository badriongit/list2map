import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class List2Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<ResponseObj> list1 = new ArrayList<ResponseObj>();
      ResponseObj obj1 = new ResponseObj("q1","1000",null);
      ResponseObj obj2 = new ResponseObj("q2","2000",null);
      ResponseObj obj3 = new ResponseObj("q3","3000",null);
   //   ResponseObj obj4 = new ResponseObj("q4","4000",null);
      list1.add(obj1);
      list1.add(obj2);
      list1.add(obj3);
     // list1.add(obj4);
      
      List<ResponseObj> list2 = new ArrayList<ResponseObj>();
      ResponseObj obj5 = new ResponseObj("q1",null,"5500");
   //   ResponseObj obj6 = new ResponseObj("q2",null,"6500");
      ResponseObj obj7 = new ResponseObj("q3",null,"7500");
      ResponseObj obj8 = new ResponseObj("q4",null,"8500");
      list2.add(obj5);
     // list2.add(obj6);
      list2.add(obj7);
      list2.add(obj8);
      
      Map<String, String[]> map=getMap(list1,list2);
      
      for (Map.Entry<String, String[]> entry : map.entrySet())
      {
    	  String[] valuesList = entry.getValue();
    	  StringBuffer valuesBuffer = new StringBuffer("");
    	  valuesBuffer.append("{");
    	  for(String val : valuesList){
    		  valuesBuffer.append(val+",");
    	  }
    	  valuesBuffer.append("}");
    	  valuesBuffer.deleteCharAt(valuesBuffer.length()-2);
          System.out.println(entry.getKey() + "," + valuesBuffer );
      }
	}

	private static Map<String, String[]> getMap(List<ResponseObj> list1,
			List<ResponseObj> list2) {
		Map<String, String[]> map = new HashMap<String, String[]>();
		
		for(ResponseObj obj : list1){
			String[] values = new String[2];
			String quarter = obj.getQuarter();
			String target = obj.getTarget();
			String actual = obj.getActual();
			values[0] = target;
			values[1] = actual;
			map.put(quarter, values);
		}
		
        for(ResponseObj obj : list2){
        	String[] values1 = new String[2];
        	String quarter = obj.getQuarter();
			String target = obj.getTarget();
			String actual = obj.getActual();
        	if(map.containsKey(quarter)){
				String[] valList = map.get(quarter);
			//	valList[0] = target;
				valList[1] = actual;
				map.put(quarter, valList);
			} else {
				values1[0] = target;
				values1[1] = actual;
				map.put(obj.getQuarter(), values1);	
			}
			
		}
		
		return map;
	}

}
