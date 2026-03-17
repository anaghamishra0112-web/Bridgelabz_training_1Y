package method_level3;
public static int[][] gen(int r,int c){
    int[][] a=new int[r][c];
    java.lang.Object Math;
    for(int i = 0; i<r; i++)
        for(int j=0;j<c;j++)
            a[i][j]=(int)(Math.random()*10);
    return a;
}

public static int[][] add(int[][] a,int[][] b){
    int r=a.length,c=a[0].length;
    int[][] m=new int[r][c];
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            m[i][j]=a[i][j]+b[i][j];
    return m;
}

public static int[][] sub(int[][] a,int[][] b){
    int r=a.length,c=a[0].length;
    int[][] m=new int[r][c];
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            m[i][j]=a[i][j]-b[i][j];
    return m;
}

public static int[][] mul(int[][] a,int[][] b){
    int r=a.length,c=b[0].length;
    int[][] m=new int[r][c];
    for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
            for(int k=0;k<b.length;k++)
                m[i][j]+=a[i][k]*b[k][j];
    return m;
}

public static void main(String[] args) {
    int[][] a = gen(2,2);
    int[][] b = gen(2,2);

    int[][] result = add(a,b);

    for(int i=0;i<result.length;i++){
        for(int j=0;j<result[0].length;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
}
