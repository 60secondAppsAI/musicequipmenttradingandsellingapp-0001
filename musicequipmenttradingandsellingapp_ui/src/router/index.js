import Vue from 'vue'
import VueRouter from 'vue-router'
import Users from  '@/pages/Users.vue';
import UserDetail from  '@/pages/UserDetail.vue';
import Items from  '@/pages/Items.vue';
import ItemDetail from  '@/pages/ItemDetail.vue';
import Categorys from  '@/pages/Categorys.vue';
import CategoryDetail from  '@/pages/CategoryDetail.vue';
import Offers from  '@/pages/Offers.vue';
import OfferDetail from  '@/pages/OfferDetail.vue';
import Transactions from  '@/pages/Transactions.vue';
import TransactionDetail from  '@/pages/TransactionDetail.vue';
import Reviews from  '@/pages/Reviews.vue';
import ReviewDetail from  '@/pages/ReviewDetail.vue';
import Messages from  '@/pages/Messages.vue';
import MessageDetail from  '@/pages/MessageDetail.vue';

Vue.use(VueRouter)

let routes = [
	{
		// will match everything
		path: '*',
		component: () => import('../views/404.vue'),
	},
	{
		path: '/',
		name: 'Home',
			redirect: '/users',
								},
	{
		path: '/dashboard',
		name: 'Dashboard',
		layout: "dashboard",
		// route level code-splitting
		// this generates a separate chunk (about.[hash].js) for this route
		// which is lazy-loaded when the route is visited.
		component: () => import(/* webpackChunkName: "dashboard" */ '../views/Dashboard.vue'),
	},
	{
		path: '/layout',
		name: 'Layout',
		layout: "dashboard",
		component: () => import('../views/Layout.vue'),
	},
	{
		path: '/users',
		name: 'Users',
		layout: "dashboard",
		component: Users,
	},
	{
	    path: '/user/:userId', 
	    name: 'UserDetail',
		layout: "dashboard",
	    component: UserDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/items',
		name: 'Items',
		layout: "dashboard",
		component: Items,
	},
	{
	    path: '/item/:itemId', 
	    name: 'ItemDetail',
		layout: "dashboard",
	    component: ItemDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/categorys',
		name: 'Categorys',
		layout: "dashboard",
		component: Categorys,
	},
	{
	    path: '/category/:categoryId', 
	    name: 'CategoryDetail',
		layout: "dashboard",
	    component: CategoryDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/offers',
		name: 'Offers',
		layout: "dashboard",
		component: Offers,
	},
	{
	    path: '/offer/:offerId', 
	    name: 'OfferDetail',
		layout: "dashboard",
	    component: OfferDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/transactions',
		name: 'Transactions',
		layout: "dashboard",
		component: Transactions,
	},
	{
	    path: '/transaction/:transactionId', 
	    name: 'TransactionDetail',
		layout: "dashboard",
	    component: TransactionDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/reviews',
		name: 'Reviews',
		layout: "dashboard",
		component: Reviews,
	},
	{
	    path: '/review/:reviewId', 
	    name: 'ReviewDetail',
		layout: "dashboard",
	    component: ReviewDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/messages',
		name: 'Messages',
		layout: "dashboard",
		component: Messages,
	},
	{
	    path: '/message/:messageId', 
	    name: 'MessageDetail',
		layout: "dashboard",
	    component: MessageDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/requests/quickadd',
		name: 'QuickAdd',
		layout: "dashboard",
		meta: {
			title: 'quickadd',
			sidebarMap: ['applications'],
			breadcrumbs: ['Requests', 'QuickAdd'],
		},
		component: () => import('../pages/QuickAdd.vue'),
	},
	{
		path: '/tables',
		name: 'Tables',
		layout: "dashboard",
		component: () => import('../views/Tables.vue'),
	},
	{
		path: '/billing',
		name: 'Billing',
		layout: "dashboard",
		component: () => import('../views/Billing.vue'),
	},
	{
		path: '/rtl',
		name: 'RTL',
		layout: "dashboard-rtl",
		meta: {
			layoutClass: 'dashboard-rtl',
		},
		component: () => import('../views/RTL.vue'),
	},
	{
		path: '/Profile',
		name: 'Profile',
		layout: "dashboard",
		meta: {
			layoutClass: 'layout-profile',
		},
		component: () => import('../views/Profile.vue'),
	},
	{
		path: '/sign-in',
		name: 'Sign-In',
		component: () => import('../views/Sign-In.vue'),
	},
	{
		path: '/sign-up',
		name: 'Sign-Up',
		meta: {
			layoutClass: 'layout-sign-up',
		},
		component: () => import('../views/Sign-Up.vue'),
	},
]

// Adding layout property from each route to the meta
// object so it can be accessed later.
function addLayoutToRoute( route, parentLayout = "default" )
{
	route.meta = route.meta || {} ;
	route.meta.layout = route.layout || parentLayout ;
	
	if( route.children )
	{
		route.children = route.children.map( ( childRoute ) => addLayoutToRoute( childRoute, route.meta.layout ) ) ;
	}
	return route ;
}

routes = routes.map( ( route ) => addLayoutToRoute( route ) ) ;

const router = new VueRouter({
	mode: 'hash',
	base: process.env.BASE_URL,
	routes,
	scrollBehavior (to, from, savedPosition) {
		if ( to.hash ) {
			return {
				selector: to.hash,
				behavior: 'smooth',
			}
		}
		return {
			x: 0,
			y: 0,
			behavior: 'smooth',
		}
	}
})

export default router
