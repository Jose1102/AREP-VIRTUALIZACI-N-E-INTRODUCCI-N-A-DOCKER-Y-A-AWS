function getValueInput() {

    let inputValue = document.getElementById("domTextElement").value;
    const divRoot = document.querySelector('#root');

    const abb = <h1 class="text-uppercase">Microservicio!</h1>
    const peticion = fetch(`http://localhost:4567/hello`);
    console.log(checkSize())

    peticion
        .then(resp => resp.json())
        .then( mensajes => {

            for (let i = 0; i < 9; i++) {
                const valor = mensajes[i];
                const {mensaje,fecha} = valor;
                let contador = i+1;

                const temp = mensaje;
                const fechaTemp = fecha;
                console.log(temp);
                document.getElementById("body").innerHTML += `
                <tr>
                      <th scope="row">${contador}</th>
                      <td>${temp}</td>
                      <td>${fechaTemp}</td>
                </tr>
                `;







            }










        })


}

function sendMessage() {

    var url=window.location.href+'/resultados';
    var mensaje=document.getElementById("domTextElement").value;

    axios.post(url,mensaje)
        .then(res => {
                console.log(res);
            }
        )

    location.reload();
}

function checkSize() {

    const peticionSize = fetch(`http://localhost:4567/size`);

    peticionSize
        .then(resp => resp.json())
        .then(size =>{

            return size;

            }


        )
    console.log()

}

function tamaño(size){

    return size;

}



