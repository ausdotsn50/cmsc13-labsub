#include <stdio.h>

void inputMatrix(int size, int matrix[size][size], char id);
void addMatrices(int size, int m1[size][size], int m2[size][size]);

int main() {
    printf("Matrix Addition Calculator\n");

    int size_a, size_b;
    printf("Input row/col size for matrix_a: ");
    scanf("%d", &size_a);

    printf("Input row/col size for matrix_b: ");
    scanf("%d", &size_b);

    int matrix_a[size_a][size_a];
    int matrix_b[size_b][size_b];

    // Rainy day
    if(size_a != size_b) {
        printf("Cannot perform matrix addition\n");
        return 1;
    }
    // Sunny Day: Matrix Addition executes correctly
    else {
        int size = size_a = size_b;

        // Input matrix a data
        inputMatrix(size, matrix_a, 'a');
        // Input matrix b data
        inputMatrix(size, matrix_b, 'b');
        
        // Add matrices
        addMatrices(size, matrix_a, matrix_b);
    }

}

void inputMatrix(int size, int matrix[size][size], char id) {
    // Input matrix a data
    printf("Fill matrix_%c data\n", id);
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            printf("Input element for row %d col %d: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }
}

void addMatrices(int size, int m1[size][size], int m2[size][size]) {
    int m3[size][size];
    printf("Output matrix\n");
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            m3[i][j] = m1[i][j] + m2[i][j];
            printf("[%d] ", m3[i][j]);
        }
        printf("\n");
    }
}