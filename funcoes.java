package Facul;

static String primo (int n1){
	String resultado="";
	int cont=0;
	for (int i=1; i<=n1; i++){
		if (n1%i==0){
			cont++;
		}
	}
	if (cont<=2){
		resultado="é primo";
	}else{
		resultado="não é primo";
	}
	return resultado;
}
static String parimpar(int n1) {
	String impar="";
	if (n1%2==0) {
		impar=" é par";
	} else {
		impar=" é impar";
	}
	return impar;
}
static double poten (double n1, double n2){
	double respot=0;
	respot=Math.pow(n1,n2);
	return respot;
}
static double divis (double n1, double n2){
	double resdiv=0;
	resdiv=n1/n2;
	return resdiv;
}
