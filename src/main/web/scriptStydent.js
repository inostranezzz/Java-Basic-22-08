            function addStudentInfo(){
            let studentsTab = document.getElementById("studentInfoTab").getElementsByTagName("tbody")[0];
            let fioText = document.getElementById("fioTextBox").value;
            let bornDate = document.getElementById("bornDate").value;
            let gender = document.getElementById("genderBox").value;

            if(isBlank(fioText)){
                alert("Безликие не учатся у Mr. Oizo");
                return;
            }

            if(isBlank(bornDate)){
                alert("Не имеющие даты рождения не учатся у Mr. Oizo");
                return;
            }

            if(Math.floor((new Date() - new Date(bornDate))/1000/3600/24/365) < "18"){
                alert("Не веселящиеся не учатся у Mr. Oizo");
                return;
            }

            let newRow = studentsTab.insertRow(studentsTab.rows.length);

            let fioCell = newRow.insertCell(0);
            fioCell.appendChild(document.createTextNode(fioText));

            let genderCell = newRow.insertCell(1);
            genderCell.appendChild(document.createTextNode(gender));

            let bornDateCell = newRow.insertCell(2);
            bornDateCell.appendChild(document.createTextNode(bornDate));

            let ageCell = newRow.insertCell(3);
            ageCell.appendChild(document.createTextNode(Math.floor((new Date() - new Date(bornDate))/1000/3600/24/365)));

           let sumMiddleAge = count = 0;
            for(let i = 0; i < studentsTab.rows.length; i++){
                try{
                sumMiddleAge += parseFloat(studentsTab.rows[i].getElementsByTagName("td")[3].innerHTML)
                }
                catch (e){
                console.log("Ошибка таблицы первого элемента");
                count--;
                }
                count++;
            }
            let calcMiddleAge = sumMiddleAge/count;
            document.getElementById("middleAge").innerHTML = Math.ceil(calcMiddleAge);

        }

        function isBlank(str) {
            return (!str || /^\s*$/.test(str));
        }