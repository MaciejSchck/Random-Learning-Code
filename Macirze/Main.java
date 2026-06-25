public class Macirz {

    private int macirzLength;
    private int macirzWidth;
    private int[][] defaultMacirz;

    public void setMacirzLength(int userLengthInput){
        this.macirzLength = userLengthInput;
    }
    public void setMacirzWidth(int userWidthInput){
        this.macirzWidth = userWidthInput;
    }
    public void createMacirz(){
        System.out.println();
        System.out.println("Heres yo new macirz:");
        this.defaultMacirz = new int[macirzLength][macirzWidth];
        for(int i=0; i<macirzLength; i++){
            System.out.println();
            for(int j=0; j<macirzWidth; j++){
                defaultMacirz[i][j] = (int) (Math.random()*5)+1;
                System.out.print(defaultMacirz[i][j]+" ");
            }
        }
        System.out.println();
    }
    public void invertDiagonallyRight(){
        for(int i=0; i<macirzLength; i++){
            System.out.println();
            for(int j=0; j<macirzWidth; j++){
                System.out.print(defaultMacirz[j][i]+" ");
            }
        }
    }
    public void invertDiagonallyLeft(){
        for(int i=macirzLength-1; i>=0; i--){
            System.out.println();
            for(int j=macirzWidth-1; j>=0; j--){
                System.out.print(defaultMacirz[i][j]+" ");
            }
        }
    }
    public void invertHorizontally(){
        for(int i=macirzLength-1; i>=0; i--){
            System.out.println();
            for(int j=0; j<macirzWidth; j++){
                System.out.print(defaultMacirz[i][j]+" ");
            }
        }
    }
    public void invertVertically(){
        for(int i=0; i<macirzLength; i++){
            System.out.println();
            for(int j=macirzWidth-1; j>=0; j--){
                System.out.print(defaultMacirz[i][j]+" ");
            }
        }
    }
    public void executeUserOperationChoice(int response) {
        System.out.println();
        System.out.println("Heres your inverted macirz:");
        switch (response) {
            case 1:
                invertDiagonallyRight();
                break;
            case 2:
                invertDiagonallyLeft();
                break;
            case 3:
                invertHorizontally();
                break;
            case 4:
                invertVertically();
                break;
        }
    }
}
