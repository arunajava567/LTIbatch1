function  validate()
  {
   if(document.f.id.value.length<4)
     alert("id should be more than 4 characters");
   if(document.f.pwd.value.length<6)
     alert("password should be more than 6 characters");
  }