#include <stdio.h>

void displayMatrix(int size, int matrix[size][size]);
void addMatrices(int size, int m1[size][size], int m2[size][size]);

int main() {
    printf("Matrix Addition Calculator\n\n");

    // Hardcoded matrices
    int matrix_a[2][2] = {{1, 2}, {3, 4}};
    int matrix_b[2][2] = {{5, 6}, {7, 8}};
    
    int size = 2;
    printf("Matrix A\n");
    displayMatrix(size, matrix_a);

    printf("Matrix B\n");
    displayMatrix(size, matrix_b);
    printf("\n");

    // Add matrices
    addMatrices(size, matrix_a, matrix_b);
}

void displayMatrix(int size, int matrix[size][size]) {
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            printf("[%d]\t", matrix[i][j]);
        }
        printf("\n");
    }
}

void addMatrices(int size, int m1[size][size], int m2[size][size]) {
    int m3[size][size];
    printf("Output matrix\n");
    for(int i = 0; i < size; i++) {
        for(int j = 0; j < size; j++) {
            m3[i][j] = m1[i][j] + m2[i][j];
            printf("[%d]\t", m3[i][j]);
        }
        printf("\n");
    }
}