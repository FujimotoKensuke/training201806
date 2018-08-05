function update(elm){
    var texts = elm.getElementsByTagName("td");
    var itemId = texts[0].innerHTML;
    var itemName = texts[1].innerHTML;
    var price = texts[2].innerHTML;
    location.href = "./itemUpdate?itemId=" + itemId + "&itemName=" + itemName + "&price=" + price;
}

