package Matrix;
public class mtrxMultiply{
double [] [] multiply ( double [ ] [ ] a, double [ ] [ ] b ) {
int m= a. length ;
int n = a [ O ]. length
int p= b. length
int q = b [ O ]. length
if ( n != p )  return null ; 
double C [ ] [ ] = new double [ m ] [ q ]
for (int i= O ; i < m ;i+ + ) {
for (int j= O ; i < q ;j+ + ){
for (int k= O ; k < n ; k+ + ){
C [ i ] [ j ] + = a [ i ] [ k ] * b [ k ] [ j ] }}}
return C ; }
}