import java.util.ArrayList; 
  
class AvgScore { 
  
    static void getStudentsList(String[] file) 
    { 
        int avgScore; 
        int maxAvgScore = Integer.MIN_VALUE; 
  
        ArrayList<String> names = new ArrayList<>(); 
  
        for (int i = 0; i < file.length; i += 4) { 
  
            avgScore = (Integer.parseInt(file[i + 1]) +  
                        Integer.parseInt(file[i + 2]) +  
                       Integer.parseInt(file[i + 3])) / 3; 
  
            if (avgScore > maxAvgScore) { 
                maxAvgScore = avgScore; 
  
                names.clear(); 
                names.add(file[i]); 
            } 
  
            else if (avgScore == maxAvgScore) 
                names.add(file[i]); 
        } 
  
        for (int i = 0; i < names.size(); i++) { 
            System.out.print(names.get(i) + " "); 
        } 
  
        System.out.print(maxAvgScore); 
    } 
  
    public static void main(String args[]) 
    { 
        String[] file = { "Bhaskar", "250", "350",  
                        "150", "reddy", "10", "501", "101" }; 
        getStudentsList(file); 
    } 
} 