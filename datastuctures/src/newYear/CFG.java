package newYear;

class GFG 
{  

  

static int height = 5; 

static int width = (2 * height) - 1; 

static int abs(int d) 
{ 
    return d < 0 ? -1 * d : d; 
} 
  
// Function to print the pattern of 'A' 
static void printA() 
{ 
    int n = width / 2, i, j; 
    for (i = 0; i < height; i++)  
    { 
        for (j = 0; j <= width; j++) 
        { 
            if (j == n || j == (width - n) 
                || (i == height / 2 && j > n 
                    && j < (width - n))) 
                System.out.print("*"); 
            else
                System.out.print(" "); 
        } 
        System.out.print("\n"); 
        n--; 
    } 
}

static void printE() 
{ 
    int i, j; 
    for (i = 0; i < height; i++)  
    { 
        System.out.print("*"); 
        for (j = 0; j < height; j++)  
        { 
            if ((i == 0 || i == height - 1) 
                || (i == height / 2
                    && j <= height / 2)) 
                System.out.print("*"); 
            else
                continue; 
        } 
        System.out.print("\n"); 
    } 
} 

static void printH() 
{ 
    int i, j; 
    for (i = 0; i < height; i++)  
    { 
        System.out.printf("*"); 
        for (j = 0; j < height; j++) 
        { 
            if ((j == height - 1) 
                || (i == height / 2)) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        System.out.printf("\n"); 
    } 
} 

static void printN() 
{ 
    int i, j, counter = 0; 
    for (i = 0; i < height; i++) 
    { 
        System.out.printf("*"); 
        for (j = 0; j <= height; j++)  
        { 
            if (j == height) 
                System.out.printf("*"); 
            else if (j == counter) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        counter++; 
        System.out.printf("\n"); 
    } 
} 

static void printP() 
{ 
    int i, j; 
    for (i = 0; i < height; i++) 
    { 
        System.out.printf("*"); 
        for (j = 0; j < height; j++)  
        { 
            if ((i == 0 || i == height / 2) 
                && j < height - 1) 
                System.out.printf("*"); 
            else if (i < height / 2
                    && j == height - 1 && i != 0) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        System.out.printf("\n"); 
    } 
} 

static void printR() 
{ 
    int i, j, half = (height / 2); 
    for (i = 0; i < height; i++)  
    { 
        System.out.printf("*"); 
        for (j = 0; j < width; j++)  
        { 
            if ((i == 0 || i == half) 
                && j < (width - 2)) 
                System.out.printf("*"); 
            else if (j == (width - 2) 
                    && !(i == 0 || i == half)) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        System.out.printf("\n"); 
    } 
} 


static void printW() 
{ 
    int i, j, counter = height / 2; 
    for (i = 0; i < height; i++)  
    { 
        System.out.printf("*"); 
        for (j = 0; j <= height; j++)  
        { 
            if (j == height) 
                System.out.printf("*"); 
            else if ((i >= height / 2) 
                    && (j == counter 
                    || j == height - counter - 1)) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        if (i >= height / 2) 
        { 
            counter++; 
        } 
        System.out.printf("\n"); 
    } 
}

static void printY() 
{ 
    int i, j, counter = 0; 
    for (i = 0; i < height; i++) 
    { 
        for (j = 0; j <= height; j++) 
        { 
            if (j == counter 
                || j == height - counter 
                && i <= height / 2) 
                System.out.printf("*"); 
            else
                System.out.printf(" "); 
        } 
        System.out.printf("\n"); 
        if (i < height / 2) 
            counter++; 
    } 
} 
public static void main(String[] args) 
{ 
    char character = 'A'; 
    printA(); 
} 

}

