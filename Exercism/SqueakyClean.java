class SqueakyClean {
    static String clean(String identifier) {
        String result="";
        for(int i=0;i<identifier.length();i++){
            if(identifier.charAt(i)==' '){
                result = result+"_";
            }
            else if(identifier.charAt(i)=='-'){
                result = result+Character.toString(identifier.charAt(i+1)).toUpperCase();
                i++;
            }
            else if(identifier.charAt(i)=='4' || identifier.charAt(i)=='3' ||identifier.charAt(i)=='0'||identifier.charAt(i)=='1'||identifier.charAt(i)=='7'){
                switch(Character.toString(identifier.charAt(i))){
                    case "4":
                        result=result+"a";break;
                    case "3":
                        result=result+"e";break;
                    case "0":
                        result = result+"o";break;
                    case "1":
                        result =result+"l";break;
                    case "7":
                        result= result+"t";break;
                }
            }
            else if(!(Character.isLetterOrDigit(identifier.charAt(i)))){
                continue;
            }
            else{
            result=result+Character.toString(identifier.charAt(i));     
            }
           
        }
        return result;
    }
}
