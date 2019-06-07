<#include "security.ftl">
<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg text-white navbar-dark bg-dark">
    <a class="navbar-brand" href="/">Тести з ПДР</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/login">Авторизація</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/registration">Реєстрація</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Тести</a>
            </li>
        </ul>
        <div class="navbar-text mr-3">${name}</div>
        <@l.logout />
    </div>
</nav>