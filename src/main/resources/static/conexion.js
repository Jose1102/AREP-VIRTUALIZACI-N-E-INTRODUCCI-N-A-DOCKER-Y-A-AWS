function getValueInput() {

    let inputValue = document.getElementById("domTextElement").value;

    const divRoot = document.querySelector('#root');

    const divTabla = document.querySelector('#tablaIdentificador');
    const abb = <h1 class="text-uppercase">Microservicio!</h1>
    const peticion = fetch(`http://localhost:4567/hello`);

    peticion
        .then(resp => resp.json())
        .then( mensajes => {

            let valor = mensajes[0]
            const {mensaje} = valor;
            console.log(mensaje);

            const tabla = <table class="table table-dark">
                <thead>
                <tr>
                    <th>Information</th>

                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>{mensaje}</td>

                </tr>
                </tbody>
            </table>;


            ReactDOM.render(tabla, divTabla);

        })


}


