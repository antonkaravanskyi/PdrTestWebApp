<#import "parts/common.ftl" as c>

<@c.page>
    <form action="/tests" method="get" id="mainForm">
        <div class="form-group">
            <label for="exampleFormControlSelect1">Варіанти тестів</label>
            <div class="form-group">
                <select class="form-control" id="testId">
                    <option selected>Білет №...</option>
                    <#list tests as test>
                        <option><p>${test.testName}</option>
                    </#list>
                </select>
            </div>
        </div>


        <button class="btn btn-dark" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
            Розпочати тест</button>
        <form method="get" id="firstForm">
            <p>
                <#if test??>
                                    <label>${test}</label>
                </#if>
            <div class="collapse" id="collapseExample">
                <ul class="list-group">
                    <#list tests as test>
                        <#list test.tasks as task>
                            <b><li class="list-group-item">${test.testName} ${task.taskName}</b>
                            <br>
                            <label class="form-check-label" for="gridRadios1">${task.question}</label>
                            <fieldset class="form-group">
                                <div class="row">
                                    <legend class="col-form-label col-sm-2 pt-0"></legend>
                                    <div class="col-sm-10">
                                        <#list task.answers as answer>
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>
                                                <label class="form-check-label" for="gridRadios1">${answer.answerName}</label>
                                            </div>
                                        </#list>
                                    </div>
                                </div>
                            </fieldset>
                            </li>
                        </#list>
                    </#list>
                </ul>
                <button type="submit">BUTTON</button>
            </div
            </p>
        </form>
    </form>
</@c.page>
<script>
    let selector = document.getElementById('testId');
    let firstForm = document.getElementById('firstForm');
    selector.addEventListener('change', function () {
        firstForm.setAttribute('action', `/test/${selector.value}`);
    });
</script>
