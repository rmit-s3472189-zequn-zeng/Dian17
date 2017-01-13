/**
 * to manage answer question and ask question
 */

function constructQuestion(content) {
        return '<div>' +
                        '<div>' +
                        'Question: '+
                        content +
                        '<button type ="button"'+
                        'onclick= "showinputtable()">回复</button>'+
                        '</div>' +
                        '<h1 id="questionFlag" hidden>'+
                        '1</h1>'+
                        '</div>';
}

function constructAnswer(answerID){
	var answerID = "answer"+answerID;
	return '<div class="field" id ="'+answerID+'">' +
	'Type your answer: <input type="text" id="useranswer" '+
	'class="input-text">'+
		'<h1 id = answerflag hidden >'+
		answerID+'</h1>'+
		'<button type="submit" onclick="submitAnswer()">提交'+
		'</button>'
		'</div>';
}

function constructAnswerView(content){
	return '<div>'+
	'Answer: '+
		content
			'</div>'
	;
}

function submitquestion(){
	var value= $('#userquestion').val();
	var packet = {
            'question': value
        };
	$.ajax({
        url: "AnswerQuestionServlet", 
        dataType: "text",
        type: "POST",
        data: packet,
        success: function(data){ 
           $("#detail").before(constructQuestion(value));
        }
     });
	
}

function submitAnswer(){
	var answer= $('#useranswer').val();
	var answerID =document.getElementById("questionFlag").innerHTML;
	var widget = "answer"+answerID;
	var packet = {
            'answer': answer
        };
	$.ajax({
        url: "AnswerQuestionServlet", 
        dataType: "text",
        type: "POST",
        data: packet,
        success: function(data){ 
           $("#detail").before(constructAnswerView(answer));
           document.body.removeChild(document.getElementById(widget));
        }
     });
}

function showinputtable(){
	var answerID =document.getElementById("questionFlag").innerHTML;
	 $("#detail").after(constructAnswer(answerID));	
}



