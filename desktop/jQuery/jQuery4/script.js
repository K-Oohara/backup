$(function(){
    
    
//    $("img").hover(
//    function(){
//        $(this).animate({
//            width:"220px"
//        });
//    },
//    function(){
//        $(this).animate({
//            width:"200px"
//        });
//    });
    $("img").hover(
    function(){
        $(this).animate({
            width:"150px",
            height:"150px",
            marginTop:"-32px"
        });
    },
    function(){
        $(this).animate({
            width:"100px",
            heght:"100px",
            marginTop:"0px",
        });
            
    });
    
});

