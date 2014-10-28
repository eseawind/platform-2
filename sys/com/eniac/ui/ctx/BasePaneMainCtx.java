package com.eniac.ui.ctx;

import java.util.HashMap;
import java.util.Map;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

import com.eniac.ui.ctrl.BasePaneLeftTreeRightTableCtrl;
import com.eniac.ui.ctrl.BasePaneMainCtrl;
import com.eniac.ui.ctrl.BasePaneNavChildMenuCtrl;
import com.eniac.ui.ctx.handler.AutoFormHandler;
import com.eniac.ui.ctx.handler.BasePaneLeftTreeRightFormHandler;
import com.eniac.ui.ctx.handler.BasePaneLeftTreeRightTableHandler;
import com.eniac.ui.ctx.handler.MetadataModelingHandler;
import com.eniac.ui.ctx.handler.NavnodeHandler;
import com.eniac.ui.mgr.BaseCtx;

/**
 * 类BasePaneMainCtx
 * 
 */
public class BasePaneMainCtx extends BaseCtx {
	/**
	 * 功能项对应的按钮集合
	 */
	public Map<String, Button> funButtonsMap = new HashMap<String, Button>();
	/**
	 * 左侧导航项对应的按钮集合
	 */
	public Map<String, Button> navButtonsMap = new HashMap<String, Button>();
	/**
	 * 获取当前对象
	 */
	public static BasePaneMainCtx currInstance;
	/**
	 * 当前点击的功能节点按钮
	 */
	private Button currentFun;

	/**
	 * 私有构造函数
	 * 
	 */
	private BasePaneMainCtx() {
		this.initialize();
	}

	/**
	 * 获取新对象
	 * 
	 */
	public static com.eniac.ui.ctx.BasePaneMainCtx newInstance() {
		BasePaneMainCtx.currInstance = new com.eniac.ui.ctx.BasePaneMainCtx();
		return BasePaneMainCtx.currInstance;
	}

	/**
	 * 获取功能项节点集合
	 * 
	 * @return 功能项节点集合
	 */
	public Map<String, Button> getFunButtonsMap() {
		return funButtonsMap;
	}

	/**
	 * 设置功能项节点集合
	 * 
	 * @param funButtonsMap
	 *            功能项节点集合
	 */
	public void setFunButtonsMap(Map<String, Button> funButtonsMap) {
		this.funButtonsMap = funButtonsMap;
	}

	/**
	 * 设置控制器方法
	 * 
	 */
	public void setCtrl(BasePaneMainCtrl ctrl) {
		super.setCtrl(ctrl);
	}

	/**
	 * 设置控制器方法
	 * 
	 */
	public BasePaneMainCtrl getCtrl() {
		return ((BasePaneMainCtrl) super.getCtrl());
	}

	/**
	 * 界面初始化
	 * 
	 */
	@Override
	public void initialize() {
		initNavMenu();
	}

	/**
	 * 加载导航菜单
	 */
	private void initNavMenu() {
		initNavChildMenu();
	}

	/**
	 * 设置功能项选中样式
	 * 
	 * @param group
	 */
	public void setButtonbgColor(String key, Map<String, Button> maps, String defaultColor, String selectedColor) {
		for (Button btn : maps.values()) {
			btn.setStyle("-fx-background-color:" + defaultColor);// #E5F5FA
		}
		Button selectedBtn = maps.get(key);
		currentFun = selectedBtn;
		if (selectedBtn != null) {
			selectedBtn.setStyle("-fx-background-color:" + selectedColor);
		}
	}

	/**
	 * 重设菜单区域
	 * 
	 * @param menuAreaKey
	 *            菜单区域对应的key唯一值
	 * @return
	 */
	public void resetMenuArea(FlowPane parent, String key, Map<String, Button> map, String defaultColor, String selectedColor) {
		setButtonbgColor(key, map, defaultColor, selectedColor);
		parent.getChildren().clear();
	}

	/**
	 * 添加分组菜单项
	 * 
	 * @return
	 */
	public Parent addNavMenuGroup(String displayName) {
		// 分组菜单项
		BasePaneNavChildMenuGroupCtx templetMgr = BasePaneNavChildMenuGroupCtx.newInstance();
		Label label = templetMgr.getCtrl().getLabel();
		label.setText(displayName);
		return label;
	}

	/**
	 * 添加分组菜单功能项
	 * 
	 * @param displayName
	 *            显示名称
	 * @return
	 */
	public Button addNavMenuGroupFun(String displayName, EventHandler handler) {
		BasePaneNavChildMenuGroupFunsCtx initBillTemplet = BasePaneNavChildMenuGroupFunsCtx.newInstance();
		Button btn = initBillTemplet.getCtrl().getBtn_fun();
		btn.setText(displayName);
		btn.setOnAction(handler);
		funButtonsMap.put(btn.toString(), btn);
		return btn;
	}

	/**
	 * 添加所有默认菜单名称
	 * 
	 * @param pane_navchildmenu
	 *            父级容器
	 * @param group
	 *            分组容器
	 */
	public void initNavMenuItems(VBox pane_navchildmenu) {
		// 添加常用功能
		final Button commonfun = addNavMenuItem("常用功能", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					resetMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents(), event.getSource().toString(), navButtonsMap, "#E5F5FA", "white");
					genCommonfunMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents());
				}
			}
		}, pane_navchildmenu);
		pane_navchildmenu.getChildren().add(commonfun);

		// 动态建模平台
		final Button dynamicmodelplat = addNavMenuItem("动态建模平台", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					resetMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents(), event.getSource().toString(), navButtonsMap, "#E5F5FA", "white");
					genDynamicmodelplatMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents());
				}
			}
		}, pane_navchildmenu);
		pane_navchildmenu.getChildren().add(dynamicmodelplat);

		// 应用管理平台
		final Button appmanageplat = addNavMenuItem("应用管理平台", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					resetMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents(), event.getSource().toString(), navButtonsMap, "#E5F5FA", "white");
					genAppmanageplatMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents());
				}
			}
		}, pane_navchildmenu);
		pane_navchildmenu.getChildren().add(appmanageplat);

		initDefineUI();

		// 设置默认样式
		commonfun.setStyle("-fx-background-color:white");
		genCommonfunMenuArea(BasePaneMainCtx.this.getCtrl().getPane_navchildmenu_contents());
	}

	/**
	 * 初始化自定义菜单节点 可以查询数据并操作
	 */
	private void initDefineUI() {
		genSingleNavnode("你好", new NavnodeHandler());
	}

	/**
	 * 生成导航节点
	 * 
	 * @param nodetext
	 * @param handler
	 */
	public void genSingleNavnode(String nodetext, EventHandler handler) {
		final Button newnodes = addNavMenuItem(nodetext, handler, this.getCtrl().getPane_navchildmenu());
		this.getCtrl().getPane_navchildmenu().getChildren().add(newnodes);
	}

	/**
	 * 生成【常用功能】子菜单项区域
	 */
	private void genCommonfunMenuArea(FlowPane parent) {
		// 添加到界面
		parent.getChildren().addAll(addNavMenuGroup("测试组"), addNavMenuGroupFun("单表体节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}
					BasePaneTableCtx tableCtx = BasePaneTableCtx.newInstance();
					tabctx.getCtrl().getBottompane().setTopAnchor(tableCtx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(tableCtx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(tableCtx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(tableCtx.getRoot(), 0.0);

					tabctx.getCtrl().getBottompane().getChildren().add(tableCtx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("单表头节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					AutoFormCtx ctx = AutoFormCtx.newInstance();
					ctx.getCtrl().getFlowpane().getChildren().clear();
					for (int i = 0; i < 30; i++) {
						AutoFormItemTextFieldCtx textFieldCtx = AutoFormItemTextFieldCtx.newInstance();
						textFieldCtx.getCtrl().getLabel().setText("标签" + (i + 1));
						ctx.getCtrl().getFlowpane().getChildren().add(textFieldCtx.getRoot());
					}
					// ctx.getCtrl().getFlowpane().setPrefSize(ctx.getCtrl().getRoot().getWidth(),
					// ctx.getCtrl().getRoot().getHeight());

					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("主子表节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					BasePaneTopFormBottomTableCtx ctx = BasePaneTopFormBottomTableCtx.newInstance();
					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("多子表节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					BasePaneTabMultiTableCtx ctx = BasePaneTabMultiTableCtx.newInstance();
					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("左树右卡节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					BasePaneLeftTreeRightFormCtx ctx = BasePaneLeftTreeRightFormCtx.newInstance();
					ctx.getCtrl().getLefttreeview().setRoot(new TreeItem<String>("根节点"));
					for (int i = 0; i < 10; i++) {
						TreeItem<String> child = new TreeItem<String>("二级子节点");
						ctx.getCtrl().getLefttreeview().getRoot().getChildren().add(child);
						if (i % 2 == 0) {
							TreeItem<String> child2 = new TreeItem<String>("三级子节点");
							child.getChildren().add(child2);
						}
					}
					ctx.getCtrl().getLefttreeview().getRoot().setExpanded(true);
					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("左树右表节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					BasePaneLeftTreeRightTableCtx ctx = BasePaneLeftTreeRightTableCtx.newInstance();
					ctx.getCtrl().getLefttreeview().setRoot(new TreeItem<String>("根节点"));
					for (int i = 0; i < 10; i++) {
						TreeItem<String> child = new TreeItem<String>("二级子节点");
						ctx.getCtrl().getLefttreeview().getRoot().getChildren().add(child);
						if (i % 2 == 0) {
							TreeItem<String> child2 = new TreeItem<String>("三级子节点");
							child.getChildren().add(child2);
						}
					}
					ctx.getCtrl().getLefttreeview().getRoot().setExpanded(true);
					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}), addNavMenuGroupFun("授权节点", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					Tab parentTab = genTab();
					// TODO 载入FXML界面
					BasePaneTabContentCtx tabctx = BasePaneTabContentCtx.newInstance();
					for (int i = 0; i < 5; i++) {
						Button btn = BasePaneButtonCtx.newInstance().getCtrl().getButton();
						btn.setText("测试按钮" + (i + 1));
						tabctx.getCtrl().getTophbox().getChildren().add(btn);
					}

					BasePaneLeftTreeCenterHBoxRightTreeCtx ctx = BasePaneLeftTreeCenterHBoxRightTreeCtx.newInstance();
					tabctx.getCtrl().getBottompane().setTopAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setBottomAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setLeftAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().setRightAnchor(ctx.getRoot(), 0.0);
					tabctx.getCtrl().getBottompane().getChildren().add(ctx.getRoot());
					parentTab.setContent(tabctx.getRoot());
				}
			}
		}));
	}

	/**
	 * 生成【动态建模平台】子菜单项区域
	 */
	private void genDynamicmodelplatMenuArea(FlowPane parent) {
		// 添加到界面
		parent.getChildren().addAll(addNavMenuGroup("用户管理"), addNavMenuGroupFun("用户组", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroupFun("用户", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroup("角色管理"), addNavMenuGroupFun("角色组", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroupFun("角色", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroup("职责管理"), addNavMenuGroupFun("职责", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}));

	}

	/**
	 * 生成【应用管理平台】子菜单项区域
	 */
	public void genAppmanageplatMenuArea(FlowPane parent) {
		// 添加到界面
		// BasePaneMainCtx.currInstance.addNavMenuGroupFun("用户注册", new
		// AutoFormHandler());
		parent.getChildren().addAll(addNavMenuGroup("系统管理工具"), addNavMenuGroupFun("元数据建模", new MetadataModelingHandler()), addNavMenuGroupFun("功能注册", new BasePaneLeftTreeRightFormHandler()), addNavMenuGroupFun("菜单建模", new BasePaneLeftTreeRightFormHandler()), addNavMenuGroup("单据管理"), addNavMenuGroupFun("单据模板初始化", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}

			}
		}), addNavMenuGroupFun("查询模板初始化", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroupFun("打印模板初始化", new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (event != null) {
					BasePaneMainCtx.this.setButtonbgColor(event.getSource().toString(), funButtonsMap, "white", "#FCEADB");
				} else {
					genTab();
				}
			}
		}), addNavMenuGroup("交易管理"));
	}

	/**
	 * 生成Tab页签
	 */
	public Tab genTab() {
		TabPane tabs = BasePaneMainCtx.this.getCtrl().getTabs();
		Tab tab = new Tab();
		tab.setText(BasePaneMainCtx.this.currentFun.getText());
		tab.setClosable(true);
		tabs.setTabClosingPolicy(TabPane.TabClosingPolicy.SELECTED_TAB);
		tabs.getTabs().add(tabs.getTabs().size(), tab);
		tabs.getSelectionModel().select(tabs.getTabs().indexOf(tab));
		return tab;
	}

	/**
	 * 添加菜单项
	 * 
	 * @param displayname
	 *            菜单显示
	 * @param handler
	 *            按钮事件类
	 * @param pane_navchildmenu
	 *            父级容器
	 * @param group
	 *            分组
	 * @return
	 */
	private Button addNavMenuItem(String displayname, EventHandler handler, VBox pane_navchildmenu) {
		BasePaneNavChildMenuCtx ctx = BasePaneNavChildMenuCtx.newInstance();
		BasePaneNavChildMenuCtrl ctrl = ctx.getCtrl();
		Button btn = (Button) ctx.getRoot();

		ctrl.getButton().setOnAction(handler);
		btn.setText(displayname);
		btn.setPrefWidth(pane_navchildmenu.getPrefWidth() - 5);
		navButtonsMap.put(btn.toString(), btn);
		return btn;
	}

	/**
	 * 加载导航子菜单
	 */
	private void initNavChildMenu() {
		initNavMenuItems(this.getCtrl().getPane_navchildmenu());
	}

}
