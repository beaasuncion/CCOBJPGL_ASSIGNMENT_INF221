public class App {


static boolean iwillNotCheat  = true;  
static boolean  IwillWin = true;
    

 public static void main(String[] args) throws Exception {

// Precondition
 
assert iwillNotCheat == true: "nandaya kasi ako huhu";

EnterCompetition();
    
assert IwillWin == true: "ang sakit mo naman";  
}
    
static void EnterCompetition(){
    IwillWin = false;
 }
    }
