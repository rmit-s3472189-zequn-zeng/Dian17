
$(function() {
    $("#login").click(function() {
        $(".login-min-mask").attr({
            style: 'display: block;',
        });
        $('#iframe1').attr({
            style: 'display: block;',
        });
        $(".login-min").attr({
            style: 'display: block;',
        });
        $('.login-min-close').click(function() {
            $(".login-min-mask").attr({
                style: 'display: none;',
            });
            $('#iframe1').attr({
                style: 'display: none;',
            });
            $(".login-min").attr({
                style: 'display: none;',
            });

        });
        /* Act on the event */
    });
})
$(function() {
    $("#register").click(function() {
        $(".login-min-mask").attr({
            style: 'display: block;',
        });
        $('#iframe2').attr({
            style: 'display: block;',
        });
        $(".login-min").attr({
            style: 'display: block;',
        });
        $('.login-min-close').click(function() {
            $(".login-min-mask").attr({
                style: 'display: none;',
            });
            $('#iframe1').attr({
                style: 'display: none;',
            });
            $(".login-min").attr({
                style: 'display: none;',
            });

        });
        /* Act on the event */
    });
})
