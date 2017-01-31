import React from 'react';
import ReactDOM from 'react-dom';
import Todo from './todo';

//Call to render our component into the DOM…
ReactDOM.render(
<div>

<h1>Our first Todo!</h1>

<Todo todo={{name: 'Task 1', id: 1, complete: false}}></Todo>

</div>, document.getElementById('app')); // ...into this element on the page

