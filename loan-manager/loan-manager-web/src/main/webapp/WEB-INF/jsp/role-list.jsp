<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/23
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fff;">
        <label>角色名称：</label>
        <input class="easyui-textbox" type="text" id="rolename">
        <label>角色状态：</label>
        <select id="rolestate" class="easyui-combobox" >
            <option value="0">全部</option>
            <option value="1">正常</option>
            <option value="2">冻结</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="thaw()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">解冻</button>
        <button onclick="freeze()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">冻结</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>


<table id="role"></table>

<script>
    function searchForm(){

        $('#role').datagrid('load',{
            rolename: $('#rolename').val(),
            rolestate: $('#rolestate').combobox('getValue')
        });
    }
    //冻结
    function freeze() {
        //获取选中的行
        var selectRows = $("#role").datagrid('getSelections');
        //没有选中行
        if(selectRows.length == 0) {
            $.messager.alert("提示","未选中记录",'warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','您确认想要冻结记录吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].roleid);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'roles/freeze',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#role').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }
    //解冻
    function thaw() {
        //获取选中的行
        var selectRows = $("#role").datagrid('getSelections');
        //没有选中行
        if(selectRows.length == 0) {
            $.messager.alert("提示","未选中记录",'warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','您确认想要解冻记录吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].roleid);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'roles/open',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#role').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }
    function add() {
        loan.addTabs('新增管理','role-add');
    }
    function edit() {


        //获取选中的行
        var selectRows = $("#role").datagrid('getSelections');
        //没有选中行
        if(selectRows.length != 1) {
            $.messager.alert("提示","请选中一条记录",'warning');
            return;
        }

        var roleid = selectRows[0].roleid;
        //选中至少一行记录
        //ajax提交数组给后台
        $.post(
            //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
            'roles/update',
            {'roleid':roleid},
            //function:处理后成功回调的函数
            function(data){
                $('#tab').tabs('close',"编辑");
                loan.addTabs('编辑','role-update');
            },
            //datatype:返回的数据类型
            'json'
        );
    }
    function remove() {
    //获取选中的行
         var selectRows = $("#role").datagrid('getSelections');
    //没有选中行
        if(selectRows.length == 0) {
            $.messager.alert("提示","未选中记录",'warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].roleid);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'roles/batch',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#role').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }

    $("#role").datagrid({
        multiSort:true,
        url:'role',
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        columns:[[
            {field:'ck',checkbox:true},
            {field:'roleid',title:'角色编号',width:100,sortable:true},
            {field:'rolename',title:'角色名称',width:100,sortable:true},
            {field:'rpassword',title:'角色密码',width:100,sortable:true},
            {field:'rolestate',title:'角色状态',width:100,sortable:true,formatter:function (value,row,index) {
                switch (value){
                    case 1:
                        return '正常';
                        break;
                    case 2:
                        return '冻结';
                        break;
                    case 3:
                        return '删除';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }},
            {field:'roledesc',title:'角色描述',width:100,sortable:true,formatter:function (value,row,index) {
                switch (value){
                    case 1:
                        return 'root';
                        break;
                    case 2:
                        return '产品管理员';
                        break;
                    case 3:
                        return '用户管理员';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }}
        ]]
    });
</script>
