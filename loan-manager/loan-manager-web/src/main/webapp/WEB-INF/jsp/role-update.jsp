<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/24
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="easyui-panel" title="" data-options="fit:true">
    <form class="itemForm" id="itemAddForm" name="itemAddForm" method="post">
        <table style="width:100%;" id="table">
            <tr>
                <td class="label">角色编号：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="roleid" name="roleid" value="${role.roleid}"
                           readonly="true"     data-options="required:true" style="width:50%">
                </td>
            </tr>
            <tr>
                <td class="label">角色名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="rolename" name="rolename" value="${role.rolename}"
                           data-options="required:true" style="width:50%">
                </td>
            </tr>
            <tr>
                <td class="label">角色密码：</td>
                <td>
                    <input class="easyui-passwordbox"  name="rpassword" prompt="Password" iconWidth="28" data-options="validType:'length[8,11]',required:true"
                           readonly="true" value="${role.rpassword}"   style="width:50%;height:34px;padding:10px">


                </td>
            </tr>
            <tr>
                <td class="label">角色状态：</td>
                <td>
                    <select id="rolestate" value="${role.rolestate}" class="easyui-combobox" name="rolestate" data-options="required:true">
                        <s:if test="${role.rolestate==1}">
                        <option value="${role.rolestate}" >正常</option>
                        </s:if>
                        <s:if test="${role.rolestate==2}">
                        <option value="${role.rolestate}" >冻结</option>
                        </s:if>
                        <option value="1" >正常</option>
                        <option value="2" >冻结</option>
                    </select>

                    <%--<input class="easyui-numberbox" type="text" id="priceView" name="priceView"
                           data-options="required:true " style="width:100%">--%>
                </td>
            </tr>
            <tr>
                <td class="label">角色描述：</td>
                <td>
                    <select id="roledesc" value="${role.roledesc}" class="easyui-combobox" data-options="required:true" name="roledesc">
                        <s:if test="${role.roledesc==1}">
                        <option value="${role.roledesc}">root</option>
                        </s:if>
                        <s:if test="${role.roledesc==2}">
                        <option value="${role.roledesc}">产品管理员 </option>
                        </s:if>
                        <s:if test="${role.roledesc==3}">
                        <option value="${role.roledesc}">用户管理员</option>
                        </s:if>
                        <option value="1">root</option>
                        <option value="2">产品管理员 </option>
                        <option value="3">用户管理员</option>
                    </select>

                    <%--<input class="easyui-numberbox" type="text" id="num" name="num"
                           data-options="required:true" style="width:100%">--%>
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>

<script>
    var ue = UE.getEditor('container');

    function submitForm() {

        $('#itemAddForm').form('submit', {
            //提交给后台处理的URL地址

            url:'update',

            //提交前的动作，如果返回false阻止提交
            onSubmit: function () {
                //this:DOM对象
                //$(this)：jquery对象
                return $(this).form('validate');
            },
            //提交处理成功后的动作
            success: function () {
                alert("保存成功");
                $('#tab').tabs('close',"编辑");
                $('#tab').tabs('close',"管理员管理");
                loan.addTabs('管理员管理','role-list');
            }
        })
    }

</script>