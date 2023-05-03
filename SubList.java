class SubList{

	public static void main(String [] args){
		System.out.println("Jai ganesh");
		System.out.println("----------------------");
		System.out.println("-GIVEN-->KEEP REMOVE KEEP REMOVE KEEP---");
		System.out.println("-EXPECTED-->KEEP KEEP KEEP---");
		System.out.println("----------------------");
        String [] givenStr= {"KEEP","REMOVE","KEEP","REMOVE","KEEP"};
		subStringRemove(givenStr);
	}


     public static void subStringRemove(String [] givenStr){
     	int c=0;
     	String [] expectedStr = new String[givenStr.length];
        for (int i=0;i<givenStr.length;i++){
            if(null!=givenStr[i] && givenStr[i].equals("KEEP")){
            	expectedStr[c]=givenStr[i];
            	c++;
            }
        }
       String [] resultStr =new String[c];
       int k=0;
        for(int j=0;j<expectedStr.length;j++){
        	if(expectedStr[j]!=null){
        		resultStr[k]=expectedStr[j];
        		k++;
        	}
        }
        System.out.print("Result ");	 
			for(String kStr:resultStr)
        	System.out.print(kStr+" ");	
     }
}