def soma(x, y):
    return x + y

def vid(x, y):
    return x / y

def mult(x, y):
    return x * y

def men(x, y):
    return x - y



num1 = (float(input("Digite um numero: ")))
num2 = (float(input("Digite o segundo numero: ")))

op_dig = (input("Digite um dos operadores [+, -, *, /]: "))

if op_dig == ("+"):
    resultado = soma (num1, num2)

elif op_dig == ("/"):
    if num2 != 0:
        resultado = vid (num1, num2)
    else:
        print("Nao e possivel dividir por zero")

elif op_dig == ("*"):
    resultado = mult(num1, num2)

elif op_dig == ("-"):
    resultado = men(num1, num2)

print(resultado)