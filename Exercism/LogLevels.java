public class LogLevels {

    public static String message(String logLine) {
        String temp ="";
        temp = temp+logLine.substring(logLine.indexOf(":") + 2);
        String result="";
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='\\'){
                i++;
            }else{
                result=result+temp.charAt(i);
            }
        }
        return result.trim();
    }


    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[")+1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {

        String logLevel = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return  message(logLine)+ " (" + logLevel(logLine) + ")";
    }
}

