var id;
var customer = {};

function getCustomerField(){
customer.firstName = $('#fname').val(),
    customer.lastName = $('#lname').val(),
    customer.email = $('#email').val(),
    customer.phone = $('#phone').val()
}

var customerTest = {
    firstName: "Diney",
    lastName: "Silva",
    email: "dsr@gmail.com",
    phone: "777888989"
};

function customerToString(customer) {
    return "<tbody> <tr>" +
        '<td id ="fn-' + customer.id + '">' + customer.firstName + '</td>' +
        '<td id ="ln-' + customer.id + '">' + customer.lastName + '</td>' +
        '<td id ="em-' + customer.id + '">' + customer.email + '</td>' +
        '<td id ="ph-' + customer.id + '">' + customer.phone + '</td>' +
        '<td><button type="button" id="edit-btn-' + customer.id +
        '" class="edit-btn btn btn-success">edit</button></td>' +
        '<td><button type="button" id="remove-btn-' + customer.id +
        '" class="remove-btn btn btn-danger">delete</button></td></tbody>'

}

function populateTable(customers) {
    $("#customerTable").empty();
    customers.map(customer =>
        $("#customerTable").append(customerToString(customer))
    )
    editCustomer();
    deleteCustomer();
}


function getCustomers() {
    // perform an ajax http get request
    $.ajax({
        url: 'http://localhost:8080/javabank5/api/customer/',
        type: 'GET',
        async: true,
        success: function successCallback(response) {
            populateTable(response);
        },
        error: function errorCallback(request, status, error) {
            if(request.status == 400){
                $('.alert');
                }else{
                    alert(error);
                }
        }
    })
}


function addCustomer() {
    $('#add-btn').click(function () {
        getCustomerField();
        $.ajax({
            url: 'http://localhost:8080/javabank5/api/customer/',
            type: 'POST',
            data: JSON.stringify(customer),
            async: true,
            contentType: 'application/json',
            success: function successCallback() {
                getCustomers();
            },
            error: function errorCallback(request, status, error) {
                if(request.status == 400){
                $('.alert');
                }else{
                    alert(error);
                }
            }
        })
    })
}


function updateCustomer() {
    $('#upd-btn').click(function () {
        $.ajax({
            url: 'http://localhost:8080/javabank5/api/customer/' + id,
            type: 'PUT',
            data: JSON.stringify(customer),
            async: true,
            contentType: 'application/json',
            success: function successCallback() {
                getCustomers();
            },
            error: function errorCallback(request, status, error) {
                if(request.status == 400){
                $('.alert');
                }else{
                    alert(error);
                }
            }
        })
    })
};

function deleteCustomer() {

    $(".remove-btn").click(function (event) {
        id = getId(event);

        $.ajax({
            url: 'http://localhost:8080/javabank5/api/customer/' + id,
            type: 'DELETE',
            async: true,
            contentType: 'application/json',
            success: function successCallback(){
                getCustomers();
            },
            error: function errorCallback(request, status, error) {
               if(request.status == 400){
                $('.alert').alert()
                }else{
                    alert(error);
                }
            }
        })
    })
};


function resetField(){

    $('#rst-btn').click(function(){
        $('#fname')[0].reset();
            $('#lname')[0].reset();
            $('#email')[0].reset();
            $('#phone')[0].reset();
    });
}

function editCustomer() {

    $(".edit-btn").click(function (event) {

        id = getId(event);

        customer.firstName = $("#fname").val($(`#fn-${id}`)[0].innerText),
            customer.lastName = $("#lname").val($(`#ln-${id}`)[0].innerText),
            customer.email = $("#email").val($(`#em-${id}`)[0].innerText),
            customer.phone = $("#phone").val($(`#ph-${id}`)[0].innerText);
    })
}

$(document).ready(function () {
    getCustomers();
    addCustomer();
    updateCustomer();
    resetField();
})


function getId(event) {
    return event.target.id.replace(/\D/g, '');
}