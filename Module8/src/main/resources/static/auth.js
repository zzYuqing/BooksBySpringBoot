// auth.js
function makeRequest(url, method, body = null) {
    var jwt = localStorage.getItem('token');
    console.log('Token from localStorage:', jwt); // 调试语句

    var headers = {
        'Content-Type': 'application/json',
        'Token': jwt // 确保这个header的名字与后端期望的一致
    };

    var config = {
        method: method,
        headers: headers,
        body: body ? JSON.stringify(body) : undefined
    };

    if (!body) {
        delete config.body;
    }

    console.log('Request headers:', config.headers); // 调试语句

    return fetch(url, config);
}


function logout() {
    localStorage.removeItem('token'); // 移除JWT
    window.location.href = 'login.html'; // 重定向到登录页面
}


// 检查每个页面的JWT
(function ensureAuthenticated() {
    if (!localStorage.getItem('token')) {
        window.location.href = 'login.html'; // 如果没有JWT，重定向到登录页面
    }
})();
