/*Alert da pagina de contado*/

//Incluindo notificação de e-mail enviado
function msgNoticacao(){
  document.getElementById("notificacao").innerHTML = 'E-mail enviado com sucesso!';
  document.getElementById("notificacao").style.backgroundColor = "rgb(0,255,0,0.15)";
  document.getElementById("notificacao").style.color = "green";
  
  //chamando a funcão de remoção da mensagem
  rmMsg(); 
}
//Removendo notificação de e-mail enviado
function rmMsg(){
setTimeout(function(){
document.getElementById("notificacao").innerHTML="";
},3000)

}
