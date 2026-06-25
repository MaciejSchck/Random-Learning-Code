async function getData() {
  const url = "http://localhost:8080/kasztany";
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const kasztany = await response.json();
    console.log(kasztany);

    for(let kasztan of kasztany){
      console.log(kasztan);
    }
    const kasztanyMapped = kasztany.map(kasztan => `<li class="kasztan"><p class="desc">Shape:</p><p class="value">${kasztan.shape}</p><p class="desc">Size:</p><p class="value">${kasztan.size}</p><p class="desc">Color:</p><p class="value">${kasztan.color}</p><p class="desc">Shank Lenght:</p><p class="value">${kasztan.shankLenght} mm</p><p class="desc">Price:</p><p class="value">${kasztan.price} zł/kg</p><img src=${kasztan.photoURL} alt=""><button data-id=${kasztan.id}>KUP TERAZ [NIE KLIKBEJT]</button></li>`);
    console.log(kasztanyMapped);
    listaKasztanow.innerHTML=kasztanyMapped.join("\n");
  } catch (error) {
    console.error(error.message)
  }
  
}
const listaKasztanow = document.querySelector("#listaKasztanow")
getData().then(() => {
  const listaButtonow = document.querySelectorAll("button");
  for(let button of listaButtonow){
    button.addEventListener("click",(evt) => {
      console.log(evt.target.dataset.id)
    })
  }
});
