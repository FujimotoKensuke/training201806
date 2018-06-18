function update(elm) {
    var texts = elm.getElementsByTagName("td");
    var productId = texts[0].innerHTML;
    var productCd = texts[1].innerHTML;
    var productName = texts[2].innerHTML;
    var price = texts[3].innerHTML;
    location.href = "./registration.html?productId=" + productId + "&productCd=" + productCd + "&productName=" + productName + "&price=" + price;
}

function init() {
    var urlPrm = new Object;
    var urlSearch = location.search.substring(0).split('&');
    for (i = 0; urlSearch[i]; i++) {
        var kv = urlSearch[i].split('=');
        urlPrm[kv[0]] = kv[1];
    }
    if (urlPrm.productId != undefined) {
        document.getElementById("productId").value = decodeURI(urlPrm.productId);
    }
    if (urlPrm.productCd != undefined) {
        document.getElementById("productCd").value = decodeURI(urlPrm.productCd);
    }
    if (urlPrm.productName != undefined) {
        document.getElementById("productName").value = decodeURI(urlPrm.productName);
    }
    if (urlPrm.price != undefined) {
        document.getElementById("price").value = decodeURI(urlPrm.price);
    }
}
