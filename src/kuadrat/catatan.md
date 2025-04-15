menghitug nilai x dalam persamaan kuadrat

int a, b, c, D
real x1,x2

Algoritmanya

input (a, b, c)

(D = determinan)
Nilai D = b * b - 4 * a * c

(menentukan dia lebih kecil atau lebih besar sama dengan nol)
if (D < 0)

then output ("akar bilangan imajiner, x1, x2 tidak bisa dihitung")
else x1= -b + akar(D) / (2 * a)
     x2= -b - akar(D) / (2 * a)

output (x1, x2)