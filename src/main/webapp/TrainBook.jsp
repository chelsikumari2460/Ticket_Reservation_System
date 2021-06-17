<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        th, td, p, input, h3 {
            font:15px 'Segoe UI';
        }
        table, th, td {
            border: solid 1px #ddd;
            border-collapse: collapse;
            padding: 2px 3px;
            text-align: center;
        }
        th {
            font-weight:bold;
        }
    </style>
</head>
<body>
	<h3>
    	Click the button to create a dynamic table using data extracted from a JSON array.
    </h3>
    
        
    <p id='showData'></p>
</body>

<script>
	// scroll down for ES6 features. 

	// using regular methods.

    window.onload = function(){
		// the json data. (you can change the values for output.)
        var myBooks = [
            {'Book ID': '1', 'Book Name': 'Challenging Times',
                'Category': 'Business', 'Price': '125.60'
            },
            {'Book ID': '2', 'Book Name': 'Learning JavaScript',
                'Category': 'Programming', 'Price': '56.00'
            },
            {'Book ID': '3', 'Book Name': 'Popular Science',
                'Category': 'Science', 'Price': '210.40'
            }
        ]

        // Extract value from table header. 
        // ('Book ID', 'Book Name', 'Category' and 'Price')
        var col = [];
        for (var i = 0; i < myBooks.length; i++) {
            for (var key in myBooks[i]) {
                if (col.indexOf(key) === -1) {
                    col.push(key);
                }
            }
        }

        // Create a table.
        var table = document.createElement("table");

        // Create table header row using the extracted headers above.
        var tr = table.insertRow(-1);                   // table row.

        for (var i = 0; i < col.length; i++) {
            var th = document.createElement("th");      // table header.
            th.innerHTML = col[i];
            tr.appendChild(th);
        }
		var th = document.createElement("th");      // table header.
            th.innerHTML = 'Book Now';
            tr.appendChild(th);
        // add json data to the table as rows.
        for (var i = 0; i < myBooks.length; i++) {

            tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) {
                var tabCell = tr.insertCell(-1);
                tabCell.innerHTML = myBooks[i][col[j]];
            }
            var tabCell = tr.insertCell(-1);
            var str = 'Click here';
			var result = str.link("/searchTrainResults/"+"jasonobj[i][0]");
            tabCell.innerHTML = result;
        }

        // Now, add the newly created table with json data, to a container.
        var divShowData = document.getElementById('showData');
        divShowData.innerHTML = "";
        divShowData.appendChild(table);
	}
	</script>
</html>