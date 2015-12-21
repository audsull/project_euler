#include <iostream>
#include <cmath>

int main() {
  int i;
  int sumsq = 0;
  int sqsum = 0;

  for(i = 1; i <= 100; i++) {
    sumsq += pow(i, 2);
    sqsum += i;
  }
  sqsum = pow(sqsum, 2);

  printf("%d\n", sqsum - sumsq);
}
