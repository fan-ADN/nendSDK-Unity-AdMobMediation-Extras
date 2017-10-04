using System;
using System.Collections.Generic;
using UnityEngine;
using GoogleMobileAds.Api.Mediation;

namespace NendMediationExtras
{
	public class NendNormalMediationExtras : MediationExtras {
		public const string interstitialTypeNormal = "interstitialTypeNormal";
		public const string interstitialTypeVideo = "interstitialTypeVideo";

		public NendNormalMediationExtras()
		{
			this.Extras = new Dictionary<string, string> ();
		}

		public string InterstitialType
		{
			set 
			{ 
				#if UNITY_IOS
				this.Extras.Add("GADMNendInterstitialType", value);
				#else
				this.Extras.Add("key_interstitial_type", value);
				#endif
			}
		}

		public string UserId
		{
			set 
			{ 
				#if UNITY_IOS
				this.Extras.Add("userId", value);
				#else
				this.Extras.Add("key_user_id", value);
				#endif
			}
		}

		public override string IOSMediationExtraBuilderClassName
		{
			get
			{
				return "GADMUAdapterNendMediationExtras";
			}
		}

		public override string AndroidMediationExtraBuilderClassName
		{
			get
			{
				return "net.nend.android.unityextramediation.GADMUAdapterNendMediationExtras";
			}
		}
	}
}

