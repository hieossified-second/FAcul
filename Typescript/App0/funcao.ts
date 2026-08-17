import prompt from 'prompt-sync'
const sc = prompt();

export function calcularMedia(nota1: number, nota2: number, nota3: number) : number{
    let media = (nota1 + nota2 + nota3) / 3;
    return media;
}

export function statusSituacao(media: number): string{
    let s: string = String("");
    if (media >= 6){
        s = "Aprovado"
    }else {
        "Reprovado"
    }
    return s;
}