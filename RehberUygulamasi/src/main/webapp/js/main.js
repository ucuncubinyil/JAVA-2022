function addNumber() {


    var rehber = new Object();
    rehber.name = $('#name').val();
    rehber.surname = $('#surname').val();
    rehber.number = $('#number').val();

    var rehberAsJson = JSON.stringify(rehber);

    if (rehber.name == "" || rehber.number == "" || rehber.surname == "") {
        alert("Değerler Boş Girilemez");
    }else{
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/insertrehber",
            data: rehberAsJson,
            success: function (response) {
                alert("Kayıt Başarılı");
                location.reload();
            }
        });
    }
}


function anaMenuyeYonlendir() {
    window.location = "http://localhost:8080/"
}

function tabloGoster() {

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/listrecords",
        success: function (response) {
            var rehberList = JSON.parse(response);

            for (var sayac = 0; sayac < rehberList.length; sayac++) {
                var rehber = rehberList[sayac];
                $('#numbers')
                    .append(
                        "<tr><td>" +
                        rehber.id +
                        "</td></tr>"+
                        "<tr><td>" +
                        rehber.name +
                        "</td></tr>" +
                        "<tr><td>" +
                        rehber.surname +
                        "</td></tr>"+
                        "<tr><td>" +
                        rehber.number +
                        "</td></tr>"


                    );
            }
        }
    });


}